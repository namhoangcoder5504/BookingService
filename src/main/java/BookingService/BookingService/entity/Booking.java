package BookingService.BookingService.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "bookings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String bookingId;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;
    @ManyToOne
    @JoinColumn(name = "specialist_id")
    private User specialist;
    private LocalDateTime bookingDate;
    private String timeSlot;
    private String status;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private Double totalPrice;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

package BookingService.BookingService.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "feedback")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String feedbackId;
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;
    @ManyToOne
    @JoinColumn(name = "specialist_id")
    private User specialist;
    private Integer rating;
    private String comment;
    private LocalDateTime createdAt;
}

package BookingService.BookingService.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "booking_services")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingService {
    @Id
    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;
}

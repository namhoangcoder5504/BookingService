package BookingService.BookingService.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "schedule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String scheduleId;
    @ManyToOne
    @JoinColumn(name = "specialist_id")
    private User specialist;
    private LocalDateTime date;
    private String timeSlot;
    private Boolean availability;
}

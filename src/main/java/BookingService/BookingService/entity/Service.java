package BookingService.BookingService.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "services")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String serviceId;
    private String name;
    private String description;
    private Double price;
    private Integer duration;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

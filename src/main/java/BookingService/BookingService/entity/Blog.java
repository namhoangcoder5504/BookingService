package BookingService.BookingService.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "blog")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String blogId;
    private String title;
    private String content;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

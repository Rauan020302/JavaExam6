package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "human")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

}

package entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "medicine")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

}

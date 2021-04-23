package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "virus")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Virus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToOne
    @JoinColumn(name = "human_id")
    private Human human;
    @ManyToOne
    @JoinColumn(name = "medicine_id")
    private Medicine medicine;

}

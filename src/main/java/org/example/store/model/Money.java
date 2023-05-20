package org.example.store.model;



import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Entity
@Table(name = "money")
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Money {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="cash")
    private int cash;
    public Money(int cash) {
        this.cash = cash;
    }

}

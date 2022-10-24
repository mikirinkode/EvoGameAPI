package com.mikirinkode.evogame.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "game")
@NoArgsConstructor
@Data
@Where(clause = "is_deleted = false")
public class GameModel extends BaseDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "game_name", nullable = false)
    private String gameName;

    @Column(name = "game_desc", nullable = false)
    private String gameDesc;

    @Column(name = "requirement", nullable = false)
    private String requirement;

    @Column(name = "price", nullable = false)
    private Double price;
}

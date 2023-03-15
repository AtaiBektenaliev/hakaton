package com.example.hakatonProgect.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AirlinesCode {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "airlines_sequence")
    @SequenceGenerator(name = "airlines_sequence", sequenceName = "airlines_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String code;
}

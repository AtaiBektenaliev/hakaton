package com.example.hakatonProgect.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AirplaneCode {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "airplane_sequence")
    @SequenceGenerator(name = "airplane_sequence", sequenceName = "airplane_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String code;
    private String state;
}

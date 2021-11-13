package ir.omidashouri.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tbl_student", schema = "studentreact_sc")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 500)
    private String name;

    @Column(name = "address", length = 500)
    private String address;
}

package dev.java17x.CadastroDeNinjas.Ninjas.Model;

import dev.java17x.CadastroDeNinjas.Missions.Model.MissionModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_ninja_register")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private int age;
    // One ninja only has one mission
    @ManyToOne
    @JoinColumn(name = "mission_id")
    private MissionModel mission;

    public NinjaModel() {}

    public NinjaModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

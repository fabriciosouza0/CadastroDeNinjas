package dev.java17x.CadastroDeNinjas.Missions.Model;

import dev.java17x.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_mission")
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String difficult;
    // One mission may have various ninjas
    @OneToMany(mappedBy = "mission")
    private List<NinjaModel> ninjas;

    public MissionModel() {
    }

    public MissionModel(long id, String name, String difficult) {
        this.id = id;
        this.name = name;
        this.difficult = difficult;
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

    public String getDifficult() {
        return difficult;
    }

    public void setDifficult(String difficult) {
        this.difficult = difficult;
    }

}

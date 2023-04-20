package entity;

import javax.persistence.*;

@Entity
@Table(name="pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Pet_Id")
    private int petId;
    @Column(name = "Pet_Name")
    private String petName;
    @Column(name = "Pet_Type")
    private String petType;
    @Column(name = "Pet_Owner")
    private String petOwner;

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetOwner() {
        return petOwner;
    }

    public void setPetOwner(String petOwner) {
        this.petOwner = petOwner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petId=" + petId +
                ", petName='" + petName + '\'' +
                ", petType='" + petType + '\'' +
                ", petOwner='" + petOwner + '\'' +
                '}';
    }
}

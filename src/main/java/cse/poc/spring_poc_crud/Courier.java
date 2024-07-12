package cse.poc.spring_poc_crud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int parcelId;
    private String receiverName;
    private String parcelItemName;
    private String receiverAddress;
    private long contact;
    private double itemPrice;
    private String itemStatus; //transit or delivered
    private String executiveName;
    public int getParcelId(){
        return parcelId;
    }
    public String getExecutiveName(){
        return executiveName;
    }
    public void setItemStatus(String ItemStatus){
        this.itemStatus = ItemStatus;
}

}
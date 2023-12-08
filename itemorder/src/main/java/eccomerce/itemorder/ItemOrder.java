package eccomerce.itemorder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Details about an Item Order")
public class ItemOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@ApiModelProperty(notes = "The unique and autogenerated ID of the order")
	private Long id;
	@ApiModelProperty(notes = "A brief description of the order")
	private String description;
	@ApiModelProperty(notes = "The quantity wich you want to order")
	private int noOfItems;
	@ApiModelProperty(notes = "The price of a single item")
	private double price;
	@ApiModelProperty(notes = "The credit card number of the purchoser.")
	private Long creditCardNo;
	@ApiModelProperty("The status of the order")
	private String status;


}

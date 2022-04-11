package eu.cec.digit.comref.interview.persistent.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ITEM")
@Data 
@AllArgsConstructor
@NoArgsConstructor
public class Item {

	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name =  "name")
	private String name;

}

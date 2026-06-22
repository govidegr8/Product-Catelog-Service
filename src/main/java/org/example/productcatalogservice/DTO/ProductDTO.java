package org.example.productcatalogservice.DTO;

import lombok.Getter;
import lombok.Setter;
import org.example.productcatalogservice.model.Category;

@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String productName;
    private String productDescription;
    private Double productPrice;
    private Category productCategory;
}

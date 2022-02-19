package com.rats.karobar.dto;

import java.math.BigDecimal;

import com.rats.karobar.entity.ITEMUNITS;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailRequest {

	private BigDecimal qty;

	private BigDecimal unitPrice;

	private ITEMUNITS unit;

	private BigDecimal discount;

	private Long itemId;

}

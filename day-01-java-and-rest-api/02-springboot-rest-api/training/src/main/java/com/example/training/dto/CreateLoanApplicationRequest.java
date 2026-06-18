package com.example.training.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateLoanApplicationRequest {
	@JsonProperty("customer_id")
	@NotBlank(message = "customer_id is required")
    private Long customerId;

    @JsonProperty("loan_amount")
	@NotBlank(message = "loan_amount is required")
    private Long loanAmount;

    @JsonProperty("tenor_month")
	@NotBlank(message = "tenor_month is required")
    private Integer tenorMonth;

    @JsonProperty("purpose")
	@NotBlank(message = "purpose is required")
    private String purpose;
}

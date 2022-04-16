package com.javastart.deposit.rest;

import java.time.OffsetDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponseDTO {
  private Long accountId;
  private String name;
  private String email;
  private String phone;
  private OffsetDateTime creationDate;
  private List<Long> bills;

}


package com.javastart.account.dto;

import java.time.OffsetDateTime;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AccountRequestDTO {

  private String name;
  private String email;
  private String phone;
  private OffsetDateTime creationDate;
  private List<Long> bills;
}

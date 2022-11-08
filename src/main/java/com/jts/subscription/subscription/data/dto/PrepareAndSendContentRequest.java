package com.jts.subscription.subscription.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PrepareAndSendContentRequest {
    private List<SubscriptionUserInfoDTO> subscriptionUserInfoDTOList;
}
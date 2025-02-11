package com.checkout.payments.beta.payout;

import com.checkout.common.beta.Currency;
import com.checkout.payments.beta.BillingDescriptor;
import com.checkout.payments.beta.payout.source.PayoutRequestSource;
import com.checkout.payments.beta.sender.RequestSender;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public final class PayoutRequest {

    private PayoutRequestSource source;

    private RequestSender sender;

    private PaymentDestination destination;

    private Long amount;

    private Currency currency;

    private String reference;

    @SerializedName("billing_descriptor")
    private BillingDescriptor billingDescriptor;

    private PaymentInstruction instruction;

    @SerializedName("processing_channel_id")
    private String processingChannelId;

    @SerializedName("success_url")
    private final String successUrl;

    @SerializedName("failure_url")
    private final String failureUrl;

}

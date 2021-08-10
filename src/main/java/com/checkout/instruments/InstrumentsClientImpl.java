package com.checkout.instruments;

import com.checkout.ApiClient;
import com.checkout.CheckoutConfiguration;
import com.checkout.SecretKeyCredentials;
import com.checkout.AbstractClient;

import java.util.concurrent.CompletableFuture;

public class InstrumentsClientImpl extends AbstractClient implements InstrumentsClient {

    private static final String INSTRUMENTS = "instruments";

    public InstrumentsClientImpl(final ApiClient apiClient, final CheckoutConfiguration configuration) {
        super(apiClient, SecretKeyCredentials.fromConfiguration(configuration));
    }

    private String getPath(final String instrumentId) {
        return INSTRUMENTS + "/" + instrumentId;
    }

    @Override
    public CompletableFuture<CreateInstrumentResponse> createInstrument(final CreateInstrumentRequest createInstrumentRequest) {
        return apiClient.postAsync(INSTRUMENTS, apiCredentials, CreateInstrumentResponse.class, createInstrumentRequest, null);
    }

    @Override
    public CompletableFuture<InstrumentDetailsResponse> getInstrument(final String instrumentId) {
        return apiClient.getAsync(getPath(instrumentId), apiCredentials, InstrumentDetailsResponse.class);
    }

    @Override
    public CompletableFuture<UpdateInstrumentResponse> updateInstrument(final String instrumentId, final UpdateInstrumentRequest updateInstrumentRequest) {
        return apiClient.patchAsync(getPath(instrumentId), apiCredentials, UpdateInstrumentResponse.class, updateInstrumentRequest, null);
    }

    @Override
    public CompletableFuture<Void> deleteInstrument(final String instrumentId) {
        return apiClient.deleteAsync(getPath(instrumentId), apiCredentials);
    }
}

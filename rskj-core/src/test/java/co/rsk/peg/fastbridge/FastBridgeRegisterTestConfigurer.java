package co.rsk.peg.fastbridge;

import co.rsk.bitcoinj.core.BtcTransaction;
import co.rsk.bitcoinj.core.Coin;
import co.rsk.config.BridgeConstants;
import org.ethereum.config.blockchain.upgrades.ActivationConfig;

import java.util.List;

public class FastBridgeRegisterTestConfigurer {
    private final BridgeConstants bridgeConstants;
    private final ActivationConfig.ForBlock activations;
    private final BtcTransaction btcTx;
    private final List<Coin> valuesToSend;
    private final boolean includeActiveFederation;
    private final boolean includeRetiringFederation;
    private final boolean retiringFederationExists;

    FastBridgeRegisterTestConfigurer(BridgeConstants bridgeConstants, ActivationConfig.ForBlock activations, BtcTransaction btcTx, List<Coin> valuesToSend, boolean includeActiveFederation, boolean includeRetiringFederation, boolean retiringFederationExists) {
        this.bridgeConstants = bridgeConstants;
        this.activations = activations;
        this.btcTx = btcTx;
        this.valuesToSend = valuesToSend;
        this.includeActiveFederation = includeActiveFederation;
        this.includeRetiringFederation = includeRetiringFederation;
        this.retiringFederationExists = retiringFederationExists;
    }

    public BridgeConstants getBridgeConstants() {
        return bridgeConstants;
    }

    public ActivationConfig.ForBlock getActivations() {
        return activations;
    }

    public BtcTransaction getBtcTx() {
        return btcTx;
    }

    public List<Coin> getValuesToSend() {
        return valuesToSend;
    }

    public boolean isIncludeActiveFederation() {
        return includeActiveFederation;
    }

    public boolean isIncludeRetiringFederation() {
        return includeRetiringFederation;
    }

    public boolean isRetiringFederationExists() {
        return retiringFederationExists;
    }

    static public class Builder {
        private BridgeConstants bridgeConstants;
        private ActivationConfig.ForBlock activations;
        private BtcTransaction btcTx;
        private List<Coin> valuesToSend;
        private boolean includeActiveFederation = false;
        private boolean includeRetiringFederation = false;
        private boolean retiringFederationExists = false;

        public Builder setBridgeConstants(BridgeConstants bridgeConstants) {
            this.bridgeConstants = bridgeConstants;
            return this;
        }

        public Builder setActivations(ActivationConfig.ForBlock activations) {
            this.activations = activations;
            return this;
        }

        public Builder setBtcTx(BtcTransaction btcTx) {
            this.btcTx = btcTx;
            return this;
        }

        public Builder setValuesToSend(List<Coin> valuesToSend) {
            this.valuesToSend = valuesToSend;
            return this;
        }

        public Builder includeActiveFederation(boolean includeActiveFederation) {
            this.includeActiveFederation = includeActiveFederation;
            return this;
        }

        public Builder includeRetiringFederation(boolean includeRetiringFederation) {
            this.includeRetiringFederation = includeRetiringFederation;
            return this;
        }

        public Builder retiringFederationExists(boolean retiringFederationExists) {
            this.retiringFederationExists = retiringFederationExists;
            return this;
        }

        public FastBridgeRegisterTestConfigurer createFastBridgeRegisterTestConfigurer() {
            return new FastBridgeRegisterTestConfigurer(
                bridgeConstants,
                activations,
                btcTx,
                valuesToSend,
                includeActiveFederation,
                includeRetiringFederation,
                retiringFederationExists
            );
        }
    }
}


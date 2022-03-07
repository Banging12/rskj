package co.rsk.peg.fastbridge;

import co.rsk.bitcoinj.core.BtcTransaction;
import co.rsk.bitcoinj.core.Coin;
import co.rsk.config.BridgeConstants;
import org.ethereum.config.blockchain.upgrades.ActivationConfig;

import java.util.List;

public class FbRegisterTestConfig {
    private final BridgeConstants bridgeConstants;
    private final ActivationConfig.ForBlock activations;
    private final BtcTransaction btcTx;
    private final List<Coin> valuesToSend;
    private final boolean includeActiveFederation;
    private final boolean includeRetiringFederation;
    private final boolean retiringFederationExists;
    private final boolean surpassesLockingCap;
    private final boolean shouldTransfer;

    FbRegisterTestConfig(
        BridgeConstants bridgeConstants,
        ActivationConfig.ForBlock activations,
        BtcTransaction btcTx,
        List<Coin> valuesToSend,
        boolean includeActiveFederation,
        boolean includeRetiringFederation,
        boolean retiringFederationExists,
        boolean surpassesLockingCap,
        boolean shouldTransfer
    ) {
        this.bridgeConstants = bridgeConstants;
        this.activations = activations;
        this.btcTx = btcTx;
        this.valuesToSend = valuesToSend;
        this.includeActiveFederation = includeActiveFederation;
        this.includeRetiringFederation = includeRetiringFederation;
        this.retiringFederationExists = retiringFederationExists;
        this.surpassesLockingCap = surpassesLockingCap;
        this.shouldTransfer = shouldTransfer;
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

    public boolean includeActiveFederation() {
        return includeActiveFederation;
    }

    public boolean includeRetiringFederation() {
        return includeRetiringFederation;
    }

    public boolean retiringFederationExists() {
        return retiringFederationExists;
    }

    public boolean surpassesLockingCap() {
        return surpassesLockingCap;
    }

    public boolean shouldTransfer() {
        return shouldTransfer;
    }

    static public class Builder {
        private BridgeConstants bridgeConstants;
        private ActivationConfig.ForBlock activations;
        private BtcTransaction btcTx;
        private List<Coin> valuesToSend;
        private boolean includeActiveFederation = false;
        private boolean includeRetiringFederation = false;
        private boolean retiringFederationExists = false;
        private boolean surpassesLockingCap = false;
        private boolean shouldTransfer = true;

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

        public Builder setSurpassesLockingCap(boolean surpassesLockingCap) {
            this.surpassesLockingCap = surpassesLockingCap;
            return this;
        }

        public Builder setShouldTransfer(boolean shouldTransfer) {
            this.shouldTransfer = shouldTransfer;
            return this;
        }

        public FbRegisterTestConfig createFastBridgeRegisterTestConfigurer() {
            return new FbRegisterTestConfig(
                bridgeConstants,
                activations,
                btcTx,
                valuesToSend,
                includeActiveFederation,
                includeRetiringFederation,
                retiringFederationExists,
                surpassesLockingCap,
                shouldTransfer
            );
        }
    }
}


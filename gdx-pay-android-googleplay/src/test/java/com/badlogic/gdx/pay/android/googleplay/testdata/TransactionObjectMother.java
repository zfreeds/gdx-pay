package com.badlogic.gdx.pay.android.googleplay.testdata;

import com.badlogic.gdx.pay.PurchaseManagerConfig;
import com.badlogic.gdx.pay.Transaction;

import java.util.Date;

import static com.badlogic.gdx.pay.android.googleplay.testdata.ProductIdentifierObjectMother.PRODUCT_IDENTIFIER_FULL_EDITION;

public class TransactionObjectMother {

    public static Transaction transactionFullEditionEuroGooglePlay() {
        Transaction transaction = new Transaction();

        transaction.setPurchaseCostCurrency("EUR");
        transaction.setPurchaseCost(100);
        transaction.setStoreName(PurchaseManagerConfig.STORE_NAME_ANDROID_GOOGLE);
        transaction.setPurchaseTime(new Date());
        transaction.setIdentifier(PRODUCT_IDENTIFIER_FULL_EDITION);
        transaction.setOrderId("GPA.1234-5678-9012-34567");
        return transaction;
    }
}
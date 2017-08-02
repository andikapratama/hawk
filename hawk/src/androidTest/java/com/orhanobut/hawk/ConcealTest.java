package com.orhanobut.hawk;

import android.support.test.runner.AndroidJUnit4;

import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class ConcealTest {
//
//  private Crypto crypto;
//
//  @Before public void setup() {
//    Context context = InstrumentationRegistry.getContext();
//    SharedPrefsBackedKeyChain keyChain = new SharedPrefsBackedKeyChain(context, CryptoConfig.KEY_256);
//    crypto = AndroidConceal.get().createDefaultCrypto(keyChain);
//  }
//
//  @Test public void cryptoIsAvailable() {
//    assertThat(crypto.isAvailable()).isTrue();
//  }
//
//  @Test public void testConceal() throws Exception {
//    Entity entity = Entity.create("key");
//    String value = "value";
//    byte[] encryptedValue = crypto.encrypt(value.getBytes(), entity);
//
//    assertThat(encryptedValue).isNotNull();
//
//    String decryptedValue = new String(crypto.decrypt(encryptedValue, entity));
//    assertThat(decryptedValue).isEqualTo("value");
//  }
}

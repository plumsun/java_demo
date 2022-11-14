package com.threadDemo;

import org.jkiss.lm.*;
import org.jkiss.utils.*;
 
import java.io.*;
import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Date;
 
 
public class DBeaverLicenseActiveMain {
    private static final LMProduct TEST_PRODUCT;
 
    static {
        TEST_PRODUCT = new LMProduct(
                "dbeaver-ue",
                "DB",
                "DBeaver Ultimate",
                "DBeaver Ultimate Edition",
                "22.1",
                LMProductType.DESKTOP,
                new Date(),
                new String[0]
        );
    }
 
 
    public static void main(String[] args) throws Exception {
        // 生成RAS密钥对
            generateKeyPair();
        // 生成加密License
        //    encryptLicense();
        // 解密License
        //    decryptLicense();
        // 导入License测试
        //    importLicense();
        // 生成明文License
        //    generateLicense();
    }
 
    private static void encryptLicense() throws Exception {
        PrivateKey privateKey = readPrivateKey();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String licenseID = LMUtils.generateLicenseId(TEST_PRODUCT);
        System.out.println("License ID: " + licenseID);
        System.out.println("Product ID (" + TEST_PRODUCT.getId() + "):");
        String productID = in.readLine();
        if (productID.isEmpty()) {
            productID = TEST_PRODUCT.getId();
        }
 
        System.out.println("Product version (" + TEST_PRODUCT.getVersion() + "):");
        String productVersion = in.readLine();
        if (productVersion.isEmpty()) {
            productVersion = TEST_PRODUCT.getVersion();
        }
 
        System.out.println("Owner ID (10000):");
        String ownerID = in.readLine();
        if (ownerID.isEmpty()) {
            ownerID = "10000";
        }
 
        System.out.println("Owner company (JKISS):");
        String ownerCompany = in.readLine();
        if (ownerCompany.isEmpty()) {
            ownerCompany = "JKISS";
        }
 
        System.out.println("Owner name (Serge Rider):");
        String ownerName = in.readLine();
        if (ownerName.isEmpty()) {
            ownerName = "Serge Rider";
        }
 
        System.out.println("Owner email (serge@jkiss.org):");
        String ownerEmail = in.readLine();
        if (ownerEmail.isEmpty()) {
            ownerEmail = "serge@jkiss.org";
        }
 
        LMLicense license = new LMLicense(
                licenseID,
                LMLicenseType.ULTIMATE,
                new Date(),
                new Date(),
                (Date)null,
                LMLicense.FLAG_UNLIMITED_SERVERS,
                productID,
                productVersion,
                ownerID,
                ownerCompany,
                ownerName,
                ownerEmail);
        byte[] licenseData = license.getData();
        byte[] licenseEncrypted = LMEncryption.encrypt(licenseData, privateKey);
        System.out.println("--- LICENSE ---");
        System.out.println(Base64.splitLines(Base64.encode(licenseEncrypted), 76));
    }
 
    private static void decryptLicense() throws Exception {
        PublicKey publicKey = readPublicKey();
        System.out.println("License:");
        byte[] encryptedLicense = LMUtils.readEncryptedString(System.in);
        LMLicense license = new LMLicense(encryptedLicense, publicKey);
        System.out.println(license);
    }
 
    private static void importLicense() throws Exception {
        final PrivateKey privateKey = readPrivateKey();
        final PublicKey publicKey = readPublicKey();
        System.out.println("License:");
        byte[] encryptedLicense = LMUtils.readEncryptedString(System.in);
        LMLicenseManager lm = new LMLicenseManager(new LMKeyProvider() {
            public Key getEncryptionKey(LMProduct product) {
                return privateKey;
            }
 
            public Key getDecryptionKey(LMProduct product) {
                return publicKey;
            }
        }, (LMLicenseValidator)null);
        lm.importLicense(TEST_PRODUCT, encryptedLicense);
    }
 
    private static void generateKeyPair() throws LMException {
        KeyPair keyPair = LMEncryption.generateKeyPair(2048);
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();
        System.out.println("--- PUBLIC KEY ---");
        System.out.println(Base64.splitLines(Base64.encode(publicKey.getEncoded()), 76));
        System.out.println("--- PRIVATE KEY ---");
        System.out.println(Base64.splitLines(Base64.encode(privateKey.getEncoded()), 76));
    }
 
    private static void generateLicense() throws LMException {
        System.out.println("Gen keys");
        KeyPair keyPair = LMEncryption.generateKeyPair(2048);
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();
        System.out.println("Gen Test license");
        String licenseID = LMUtils.generateLicenseId(TEST_PRODUCT);
        LMLicense license = new LMLicense(
                licenseID,
                LMLicenseType.ULTIMATE,
                new Date(),
                new Date(),
                (Date)null,
                LMLicense.FLAG_UNLIMITED_SERVERS,
                TEST_PRODUCT.getId(),
                TEST_PRODUCT.getVersion(),
                "10000",
                "JKISS",
                "Serge Rider",
                "serge@jkiss.org");
        byte[] subData = license.getData();
        byte[] encrypted = LMEncryption.encrypt(subData, privateKey);
        String encodedBase64 = Base64.splitLines(Base64.encode(encrypted), 76);
        byte[] encodedBinary = Base64.decode(encodedBase64);
        LMLicense licenseCopy = new LMLicense(encodedBinary, publicKey);
        System.out.println(licenseCopy);
        System.out.println("Gen subscription");
        LMSubscription subscription = new LMSubscription(
                licenseID,
                LMSubscriptionPeriod.MONTH,
                new Date(),
                new Date(),
                1,
                true);
        subData = LMEncryption.encrypt(subscription.getData(), privateKey);
        String subBase64 = Base64.splitLines(Base64.encode(subData), 76);
        byte[] subBinary = Base64.decode(subBase64);
        LMSubscription subCopy = new LMSubscription(subBinary, publicKey);
        System.out.println(subCopy);
    }
 
    private static PrivateKey readPrivateKey() throws LMException {
        File keyFile = new File(new File(System.getProperty("user.home"), ".jkiss-lm"), "private-key.txt");
        if (!keyFile.exists()) {
            throw new LMException("Cannot find private key file (" + keyFile.getAbsolutePath() + ")");
        } else {
            try {
                Throwable var1 = null;
                Object var2 = null;
 
                try {
                    InputStream keyStream = new FileInputStream(keyFile);
 
                    PrivateKey var10000;
                    try {
                        byte[] privateKeyData = LMUtils.readEncryptedString(keyStream);
                        var10000 = LMEncryption.generatePrivateKey(privateKeyData);
                    } finally {
                        if (keyStream != null) {
                            keyStream.close();
                        }
 
                    }
 
                    return var10000;
                } catch (Throwable var12) {
                    if (var1 == null) {
                        var1 = var12;
                    } else if (var1 != var12) {
                        var1.addSuppressed(var12);
                    }
                    throw var1;
                }
            } catch (Throwable var13) {
                throw new LMException(var13);
            }
        }
    }
 
    private static PublicKey readPublicKey() throws LMException {
        File keyFile = new File(new File(System.getProperty("user.home"), ".jkiss-lm"), "public-key.txt");
        if (!keyFile.exists()) {
            throw new LMException("Cannot find public key file (" + keyFile.getAbsolutePath() + ")");
        } else {
            try {
                Throwable var1 = null;
                try {
                    InputStream keyStream = new FileInputStream(keyFile);
 
                    PublicKey var10000;
                    try {
                        byte[] keyData = LMUtils.readEncryptedString(keyStream);
                        var10000 = LMEncryption.generatePublicKey(keyData);
                    } finally {
                        if (keyStream != null) {
                            keyStream.close();
                        }
 
                    }
 
                    return var10000;
                } catch (Throwable var12) {
                    if (var1 == null) {
                        var1 = var12;
                    } else if (var1 != var12) {
                        var1.addSuppressed(var12);
                    }
 
                    throw var1;
                }
            } catch (Throwable var13) {
                throw new LMException(var13);
            }
        }
    }
}
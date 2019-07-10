## Commands to generate keystore and truststore for localhost

```
keytool -genkeypair -keyalg RSA -keysize 2048 -alias localhost -dname "CN=Sumeet,OU=iamsumeet,O=iamsumeet,C=IN" -ext "SAN:c=DNS:localhost,IP:127.0.0.1" -validity 3650 -keystore keystore.pkcs12 -storepass secret -keypass secret -deststoretype pkcs12
keytool -export -alias localhost -file localhost.cer -keystore keystore.pkcs12
keytool -import -v -trustcacerts -alias localhost -file localhost.cer -keystore truststore.jks
```
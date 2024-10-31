# Iyzico Payment Integration with Java Spring Boot
#### Doğukan Yarar

This project is a test integration for Iyzico payment systems using Java Spring Boot. Non-3DS and 3DS payment methods were successfully implemented using iyzipay-java SDK.

## Technologies

- Java 11 or newer
- Spring Boot (API Development Framework)
- Iyzico API (iyzipay-java SDK) (Payment Process Management)

## Features

- 3DS Payment: Payment with secure verification step
- Non-3DS Payment: Fast payment processing

## Pom.xml File Dependency

This dependency incorporates the iyzipay-java SDK provided for Iyzico payment processing into the project. 
> Thus, direct access to Iyzico API processes such as Non-3DS and 3DS payment processes is provided and a fast integration is possible.

```sh
<dependency>
    <groupId>com.iyzipay</groupId>
    <artifactId>iyzipay-java</artifactId>
    <version>"Choose the latest version"</version>
</dependency>
```

## Configuration

Configuration values in application.yml are used for secure connection and authentication with Iyzico API
- apiKey and secretKey: Provides API authentication, ensuring that only authorized access is accepted.
- baseUrl: Used to connect to API transactions in Iyzico's sandbox or production environment.

You can access apiKey, secretKey, and baseUrl information from Iyzico's administration panel:
- apiKey and secretKey: Located in the API information section of the Iyzico dashboard. Provides private keys for Sandbox or Production environment.
- baseUrl: “https://sandbox-api.iyzipay.com” for sandbox environment and ‘https://api.iyzipay.com’ for production environment.

```sh
iyzico:
  apiKey: "SANDBOX_API_KEY"
  secretKey: "SANDBOX_SECRET_KEY"
  baseUrl: "https://sandbox-api.iyzipay.com"
```
> ⚠️ **WARNING:** Be sure to use sandbox credentials for testing purposes only. Do not use production credentials in a test environment. Do not add your API keys directly to `application.yml`. For security reasons, it is important that you encrypt these keys using [Jasypt](http://www.jasypt.org/) or a similar tool. This helps protect your sensitive information in case of direct access to the file.

## Usages

### **Sending a Non-3DS Payment Request**:
   - Send a POST request to `/api/payments/non3ds` with a `CreatePaymentRequest` payload to initiate a fast, non-authenticated payment.
   - The response will contain a `Payment` object, which includes the payment status and relevant details.

### **Sending a 3DS Payment Request**:
   - Send a POST request to `/api/payments/3ds` with a `CreatePaymentRequest` payload to initiate a secure, authenticated payment.
   - Ensure the `callbackUrl` field is set; users will be redirected to this URL upon successful completion of the 3DS authentication process.

## For More Information

- GitHub Repository: [iyzipay-java](https://github.com/iyzico/iyzipay-java)
- Iyzico Documentation: [Iyzico Docs](https://docs.iyzico.com/)
  
If you have any questions or feedback, please feel free to reach out via email at **yarardogukan@gmail.com** or connect with me on LinkedIn at [Doğukan Yarar](https://www.linkedin.com/in/yarardogukan). Your inquiries are welcome!

        

    

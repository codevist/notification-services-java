/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serve;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Codevist
 */
@WebService(serviceName = "NotificationWebService")
public class NotificationWebService {

   
    @WebMethod(operationName = "ReceiveOrderResult")
    public String ReceiveOrderResult(
            @WebParam(name = "OrderObjectId") UUID OrderObjectId,
            @WebParam(name = "GSM") String GSM,
            @WebParam(name = "MPAY") String MPAY,
            @WebParam(name = "SMSContent") String SMSContent,
            @WebParam(name = "TotalPrice") double TotalPrice,
            @WebParam(name = "TotalUnitPrice") double TotalUnitPrice,
            @WebParam(name = "State") int State,
            @WebParam(name = "StatusCode") int StatusCode,
            @WebParam(name = "ErrorCode") int ErrorCode, 
            @WebParam(name = "ErrorMessage") int ErrorMessage,
            @WebParam(name = "PaymentDateTime") Date PaymentDateTime, 
            @WebParam(name = "GsmOperator") int GsmOperator,
            @WebParam(name = "GsmType") int GsmType,
            @WebParam(name = "SubscriberId") UUID SubscriberId,
            @WebParam(name = "Products") List<CSaleProduct>  Products,
            @WebParam(name = "OrderChannelId") int  OrderChannelId,
            @WebParam(name = "PaymentTypeId") int  PaymentTypeId,
            @WebParam(name = "PaymentCategoryId") int  PaymentCategoryId,
            @WebParam(name = "Pin") String  Pin) 
    {
        return "";
    }
    
    
    
    @WebMethod(operationName = "SubscriptionDeactivation")
    public String SubscriptionDeactivation(
            
           @WebParam(name = "SubscriberId") UUID SubscriberId,
           @WebParam(name = "GSMOperator") int GSMOperator,
           @WebParam(name = "GSM") String GSM,
           @WebParam(name = "CreateDate") Date CreateDate, 
           @WebParam(name = "EndDate") Date EndDate, 
           @WebParam(name = "ProductId") int  ProductId,
           @WebParam(name = "Price") String  Price) 
           
    {
        return "";
    }
}

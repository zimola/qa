package anotherex;

public interface PARTMANAGER {
	
	public enum PartResponse{
		Success, //anything else
		OUT_OF_STOCK, //1111
		NO_LONGER_MANUFACTURED, //2222
	}
	
	public PartResponse SubmitPartForManufactureAndDelivery(
		int partNumber,
		int quantity,
		DeliveryAddress deliveryAddress
	);

}

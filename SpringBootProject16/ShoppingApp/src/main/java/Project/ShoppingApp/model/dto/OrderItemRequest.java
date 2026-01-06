package Project.ShoppingApp.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}
package store.order;

import java.util.List;

import lombok.Builder;

@Builder
public record OrderIn(
    List<ItemIn> items
) {
    @Builder
    public record ItemIn(
        String idProduct,
        Integer quantity
    ) { }
}

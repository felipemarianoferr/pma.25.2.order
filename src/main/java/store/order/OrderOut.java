package store.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Builder;
import store.product.ProductOut;

@Builder
public record OrderOut(
    String id,
    LocalDateTime date,
    List<ItemOut> items,
    BigDecimal total
) {
    public record ItemOut(
        String id,
        ProductOut product,
        Integer quantity,
        BigDecimal total
    ) { }

}

package store.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Builder;

@Builder
public record OrderSummaryOut(
    String id,
    LocalDateTime date,
    BigDecimal total
) { }

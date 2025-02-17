package jpabook2.jpashop2.domain;

import jakarta.persistence.*;
import jpabook2.jpashop2.domain.item.Item;
import lombok.Getter;

@Entity
@Getter
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private int orderPrice; //주문 가격

    private int count; //주문 수량
}

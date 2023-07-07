package com.ojo.backend.purchasing.models

import java.io.Serializable
import javax.persistence.*

@Entity
data class Purchase(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val purchaseId: Long = 0,

    @Column(name = "purchase_status")
    var purchaseStatus: String = "",

    @Column(name = "purchase_price")
    var price: Double = 0.0,

    @Column(name = "purchase_quantity")
    var quantity: Int = 0,

    @Column(name = "purchase_total")
    var total: Double = 0.0,

    @Column(name = "purchase_date")
    var date: String = "",
) : Serializable
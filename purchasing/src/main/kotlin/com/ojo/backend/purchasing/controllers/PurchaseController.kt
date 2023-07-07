package com.ojo.backend.purchasing.controllers

import com.ojo.backend.purchasing.models.Purchase
import com.ojo.backend.purchasing.services.PurchaseService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/purchase")
class PurchaseController(private val purchaseService: PurchaseService) {
    @GetMapping
    fun getPurchases(): List<Purchase> {
        return purchaseService.getPurchaseList()
    }

    @GetMapping("/{purchaseId}")
    fun getPurchase(purchaseId: Long): Purchase {
        return purchaseService.getPurchase(purchaseId)
    }

    @PostMapping
    fun createPurchase(@RequestBody purchase: Purchase): Purchase {
        return purchaseService.createPurchase(purchase)
    }
}
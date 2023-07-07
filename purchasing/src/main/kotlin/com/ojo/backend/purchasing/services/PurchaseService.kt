package com.ojo.backend.purchasing.services

import com.ojo.backend.purchasing.exceptions.BadRequestException
import com.ojo.backend.purchasing.exceptions.NotFoundException
import com.ojo.backend.purchasing.models.Purchase
import com.ojo.backend.purchasing.repository.PurchaseRepo
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class PurchaseService(
    private val purchaseRepo: PurchaseRepo,
    private val logger: Logger = LoggerFactory.getLogger(PurchaseService::class.java),
) {
    fun getPurchaseList(): List<Purchase> {
        try {
            return purchaseRepo.findAll()
        } catch (e: Exception) {
            logger.info("Error: $e")
            throw NotFoundException(
                message = "Error listing purchases",
            )
        }
    }

    fun getPurchase(purchaseId: Long): Purchase {
        try {
            return purchaseRepo.findById(purchaseId).get()
        } catch (e: Exception) {
            logger.info("Error: $e")
            throw NotFoundException(
                message = "Error finding purchase",
            )
        }
    }

    fun createPurchase(purchase: Purchase): Purchase {
        try {
            return purchaseRepo.save(purchase)
        } catch (e: Exception) {
            logger.info("Error: $e")
            throw BadRequestException(
                message = "Error creating purchase",
            )
        }
    }
}
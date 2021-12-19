

# ApplicationUser


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**userName** | **String** |  |  [optional]
**normalizedUserName** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**normalizedEmail** | **String** |  |  [optional]
**emailConfirmed** | **Boolean** |  |  [optional]
**passwordHash** | **String** |  |  [optional]
**securityStamp** | **String** |  |  [optional]
**concurrencyStamp** | **String** |  |  [optional]
**phoneNumber** | **String** |  |  [optional]
**phoneNumberConfirmed** | **Boolean** |  |  [optional]
**twoFactorEnabled** | **Boolean** |  |  [optional]
**lockoutEnd** | **OffsetDateTime** |  |  [optional]
**lockoutEnabled** | **Boolean** |  |  [optional]
**accessFailedCount** | **Integer** |  |  [optional]
**firstName** | **String** |  |  [optional]
**middleName** | **String** |  |  [optional]
**lastName** | **String** |  |  [optional]
**fullName** | **String** |  |  [optional] [readonly]
**gender** | **Gender** |  |  [optional]
**dateOfBirth** | **OffsetDateTime** |  |  [optional]
**countryId** | **UUID** |  |  [optional]
**postCode** | **String** |  |  [optional]
**referredBy** | **UUID** |  |  [optional]
**language** | **String** |  |  [optional]
**theme** | **Theme** |  |  [optional]
**designation** | **String** |  |  [optional]
**isMarkedForDeletion** | **Boolean** |  |  [optional]
**hardDeleteDate** | **OffsetDateTime** |  |  [optional]
**securityPin** | **String** |  |  [optional]
**photoUrl** | **String** |  |  [optional]
**referralCode** | **String** |  |  [optional]
**recoveryToken** | **String** |  |  [optional]
**digiLockerLastSyncDate** | **OffsetDateTime** |  |  [optional]
**refreshTokens** | [**List&lt;RefreshToken&gt;**](RefreshToken.md) |  |  [optional]
**country** | [**Country**](Country.md) |  |  [optional]
**referredByUser** | [**ApplicationUser**](ApplicationUser.md) |  |  [optional]




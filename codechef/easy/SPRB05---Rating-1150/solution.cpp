            assetToUpdate.setAssignedTo(assetDetails.getAssignedTo());

            return assetRepository.save(assetToUpdate);
        }
        
        return null;
    }

    // 6. DELETE: Remove an asset
    public String deleteAsset(Long id) {

        // TODO: Check if the asset exists
        if (assetRepository.findById(id).isPresent()) {
            // TODO: If yes: Delete it and return a success message
            assetToUpdate.setPurchaseValue(assetDetails.getPurchaseValue());
            assetToUpdate.setCategory(assetDetails.getCategory());
            assetToUpdate.setAssetName(assetDetails.getAssetName());
            Asset assetToUpdate = existing.get();
        if (existing.isPresent()) {
            assetRepository.deleteById(id);
            return "Asset with ID " + id + " has been successfully deleted.";
        } else {
            // TODO: If no: Return a "Not Found" message
            return "Asset with ID " + id + " not found.";
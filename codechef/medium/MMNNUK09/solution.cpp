    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {

        // call service to get product by id
        Product product = service.getProductById(id);
        // if product is null → return 404 NOT FOUND
        if (product == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        // else return 200 OK with product
        return ResponseEntity.ok(product);
    }
}
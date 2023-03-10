Feature: Buy pc_factory


  @Test
  Scenario Outline: The user buys products from pc_factory.cl
    Given the user enter main page
    When the user searches a element and add
    |product |id_product |
    |<product>|<id_product>|
    And the user checks the successfully message
    And the user search and add other new product
      |other_product | id_other_product|
      |<other_product>| <id_other_product>|
    And the user checks the successfully message for add other product
    When the total is superior to million delete first product
      |product |id_product |
      |<product>|<id_product>|
    Then the user can to buy succesfully

    Examples:
    |product |id_product| other_product| id_other_product |
        ##@externaldata@./src/test/resources/datadriven/test.xlsx@escenario1@
   |Notebook Gamer Nitro 5 Intel i5-11400H NVIDIA GTX 1650 15.6" FHD 144Hz 16GB RAM 512GB SSD Windows 11   |47689   |Tablet Tab M8 8" 2GB 32GB 4G LTE WiFi Quad Core Android Iron Grey   |47792|
   |Notebook Gamer Nitro 5 Intel i5-11400H NVIDIA GTX 1650 15.6" FHD 144Hz 16GB RAM 512GB SSD Windows 11   |47689   |Smartphone Moto Edge 30 Fusion 256GB/12GB Blanco Liberado   |47215|

package mycrudapp


import grails.rest.*
import grails.converters.*

class ProductController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ProductController() {
        super(Product)
    }
}

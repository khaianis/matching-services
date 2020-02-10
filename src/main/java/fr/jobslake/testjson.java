package fr.jobslake;

import com.mongodb.*;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

class JsonSimpleReadExample {

    public static void main(String[] args) {
        MongoClientURI connectionString = new MongoClientURI("mongodb://localhost:27017");
        MongoClient mongoClient = new MongoClient(connectionString);
        MongoDatabase database = mongoClient.getDatabase("tfidfdatabase");
        MongoCollection<Document> collection = database.getCollection("idf");
        BasicDBObject query = new BasicDBObject("word", new BasicDBObject("$eq", "memeza"));
        double maxIdf = 0;
        try(MongoCursor<Document> cur = collection.find(query).iterator()){

            while(cur.hasNext()){
                Document doc = cur.next();
                maxIdf = Math.max(maxIdf, (double) doc.get("idf"));
            }
        }
    }


}
package com.api.patient.dynamodb.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@DynamoDBTable(tableName = "Person")
@Data
public class Person {

    @DynamoDBGeneratedUuid(DynamoDBAutoGenerateStrategy.CREATE)
    private UUID PersonId;

    @DynamoDBHashKey(attributeName = "PersonId")
    @DynamoDBAutoGeneratedKey
    public UUID getPersonId() {
        return PersonId;
    }

    public void setPersonId(UUID personId) {
        PersonId = personId;
    }

    @DynamoDBAttribute
    private String firstname;

    @DynamoDBAttribute
    private String lastname;

    @DynamoDBAttribute
    private Date dateofBirth;

    @DynamoDBAttribute
    private String emailAddress;

    @DynamoDBAttribute
    private String dayPhone;

    @DynamoDBAttribute
    private String sex;

    @DynamoDBAttribute
    private String state;

    @DynamoDBAttribute
    private String zip;

}
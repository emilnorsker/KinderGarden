package project.kindergarden.models.request;



/*
To add a new User, the REST client will need to send details about the User to our resource.
However, there are often cases where the details sent by the client are different than what is stored in the database.
or example, UserModel has a timestamp that is generated by the service. Also, the ID is generated by the database.
Therefore, the only two values that are needed for a request are First Name and Last Name.
 */




public class ChildRequest
{
    private String firstName;
    private String lastName;


    public ChildRequest() {
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
}

package com;

public class MyPojo
{
    private RestResponse RestResponse;

    public RestResponse getRestResponse ()
    {
        return RestResponse;
    }

    public void setRestResponse (RestResponse RestResponse)
    {
        this.RestResponse = RestResponse;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [RestResponse = "+RestResponse+"]";
    }
}

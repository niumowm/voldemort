/*
 * Copyright 2008-2013 LinkedIn, Inc
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package voldemort.restclient;

import java.util.ArrayList;
import java.util.List;

public class SampleRESTClient {

    public static void main(String[] args) {

        // Create the client
        RESTClient<String, String> clientStore = new RESTClient<String, String>("http://localhost:8080",
                                                                                "test");

        // Sample put
        clientStore.put("a", "Howdy!!!!");
        clientStore.put("b", "Partner!!!!");

        // Do a sample operation:
        System.out.println("Received response : " + clientStore.get("a"));
        List<String> keyList = new ArrayList<String>();
        keyList.add("a");
        keyList.add("b");
        System.out.println("Received response : " + clientStore.getAll(keyList));

        clientStore.close();
    }
}

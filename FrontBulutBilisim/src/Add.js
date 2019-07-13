import React from 'react';
import Form from 'react-bootstrap/Form'
import Button from 'react-bootstrap/Button'
import Select from 'react-select';
import { API_SAVE } from './paths';


class AddBook extends React.Component {

    constructor() {
        super();
        this.state = {
            parakende: [
                { label: "Evet", value: "Evet" },
                { label: "Hayır", value: "Hayır" }
            ]
        }
        this.handleSubmit = this.handleSubmit.bind(this);
    }
    handleSubmit(event) {
        event.preventDefault();
        const data = new FormData(event.target)

        fetch(API_SAVE, {
            method: 'POST',
            body: data,
        });
        alert("Kaydınız Gerçekleşti");
    }

    render() {
        return <div className="col-lg-6" className="center-div">
            <Form onSubmit={this.handleSubmit}>
                <Form.Group>
                    <Form.Label>AD SOYAD :</Form.Label>
                    <Form.Control type="text" placeholder="Adınızı ve Soyadınızı giriniz" name="fullname" className="form-control-lg" required="required" />
                </Form.Group>

                <Form.Group>
                    <Form.Label>TC KİMLİK : </Form.Label>
                    <Form.Control type="number" placeholder="Tc Kimlik Numaranızı Giriniz" name="tc" className="form-control-lg" required="required" />
                </Form.Group>
                <Form.Group>
                    <Form.Label>ADRES : </Form.Label>
                    <Form.Control type="text" placeholder="Adresinizi Giriniz" name="address" className="form-control-lg" required="required" />
                </Form.Group>
                <Form.Group>
                    <Form.Label>TELEFON : </Form.Label>
                    <Form.Control type="number" placeholder="Telefon Numaranızı Giriniz" name="phone" className="form-control-lg" required="required" />
                </Form.Group>
                <Form.Group>
                    <Form.Label>E- POSTA : </Form.Label>
                    <Form.Control type="email" placeholder="E Posta Adresinizi Giriniz" name="email" className="form-control-lg" required="required" />
                </Form.Group>
                <Form.Group>
                    <Form.Label>DOĞUM TARİHİ : </Form.Label>
                    <Form.Control type="date" placeholder="Doğum Tarihinizi Giriniz" name="dateOfBirth" className="form-control-lg" required="required" />
                </Form.Group>
                <Form.Group>
                    <div >
                        <Form.Label>PERAKENDE TİCARETİ İLE UĞRAŞTINIZ MI? </Form.Label>
                        <Select options={this.state.parakende} name="retailTrade" className="form-control-lg" required="required" />
                    </div>
                </Form.Group>

                <Form.Group>
                    <Form.Label>LOKUMCU BABA’YI TERCİH ETMENİZİN SEBEBİ NEDİR?</Form.Label>
                    <Form.Control type="textArea" placeholder="Neden Lokumcu Baba" name="lokumcuBabaToChoose" className="form-control-lg" required="required" style={{ height: '150px' }} />
                </Form.Group>

                <Form.Group>
                    <Form.Label>HANGİ İL/İLÇE/SEMT İÇİN LOKUMCU BABA İŞLETMECİLİĞİ DÜŞÜNÜYORSUNUZ?</Form.Label>
                    <Form.Control type="text" placeholder="İl / İlçe / Semt Şeklinde Giriniz" name="lokumcuBabaLocation" className="form-control-lg" required="required" />
                </Form.Group>

                <Form.Group>
                    <Form.Label>YATIRIM MİKTARINIZ NEDİR ? (TL)</Form.Label>
                    <Form.Control type="number" placeholder="Yatırım miktarınızı giriniz" name="investmentAmount" className="form-control-lg" required="required" min="0" />
                </Form.Group>

                <Form.Group>
                    <Form.Label>EKLEMEK İSTEDİKLERİNİZ : </Form.Label>
                    <Form.Control type="textarea" placeholder="Eklemek İstediğiniz Başka Birşey Var Mı ? " name="wantToAdd" className="form-control-lg" style={{ height: '250px' }} />
                </Form.Group>
                <Button variant="primary" type="submit" style={{ height: '70px', width: '100px' }}>
                    Kaydet
                 </Button>

            </Form>

        </div>
    }
}

export default AddBook;